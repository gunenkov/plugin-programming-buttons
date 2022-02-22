export interface ButtonsPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
